package undoSystem;

public class UndoSystem {

    // Document Linked List
    Node DLL;

    // Undo / History Stack
    Node US;

    // Redo Stack
    Node RH;


    // =========================
    // DOCUMENT OPERATIONS
    // =========================

    public int add(String data) {

        if (DLL == null) {
            DLL = new Node(data, 0);
            return DLL.index;
        }

        Node temp = DLL;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node nn = new Node(data, temp.index + 1);

        temp.next = nn;

        return nn.index;
    }


    public int delete(String data) {

        if (DLL == null) {
            return -1;
        }

        // Delete first node
        if (DLL.data.equals(data)) {

            int deletedIndex = DLL.index;

            DLL = DLL.next;

            Node temp = DLL;
            int index = 0;

            while (temp != null) {
                temp.index = index++;
                temp = temp.next;
            }

            return deletedIndex;
        }

        // Find previous node
        Node temp = DLL;

        while (temp.next != null &&
               !temp.next.data.equals(data)) {

            temp = temp.next;
        }

        // Data not found
        if (temp.next == null) {
            return -1;
        }

        int deletedIndex = temp.next.index;

        temp.next = temp.next.next;

        // Update indexes
        Node current = temp.next;

        while (current != null) {
            current.index--;
            current = current.next;
        }

        return deletedIndex;
    }


    public void insert(String data, int index) {

        if (DLL == null) {

            if (index == 0) {
                DLL = new Node(data, 0);
            }

            return;
        }

        // Insert at beginning
        if (index == 0) {

            Node nn = new Node(data, 0);

            nn.next = DLL;
            DLL = nn;

            Node temp = DLL.next;
            int newIndex = 1;

            while (temp != null) {
                temp.index = newIndex++;
                temp = temp.next;
            }

            return;
        }

        Node temp = DLL;

        for (int i = 0; i < index - 1; i++) {

            if (temp.next == null) {
                return;
            }

            temp = temp.next;
        }

        Node nn = new Node(data, index);

        nn.next = temp.next;
        temp.next = nn;

        Node current = nn.next;
        int newIndex = index + 1;

        while (current != null) {
            current.index = newIndex++;
            current = current.next;
        }
    }


    public void printData() {

        Node temp = DLL;
        if(temp==null) {
        	System.out.println("EMPTY");
        	return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    // =========================
    // TYPE
    // =========================

    public void TYPE(String data) {

        int index = add(data);

        Node nn = new Node(data, 'T', index);

        // Push into Undo Stack
        nn.next = US;
        US = nn;

        // New operation destroys Redo history
        RH = null;
    }


    // =========================
    // DELETE
    // =========================

    public void DELETE(String data) {

        int index = delete(data);

        // Delete failed
        if (index < 0) {
            System.out.println("Invalid delete operation");
            return;
        }

        Node nn = new Node(data, 'D', index);

        // Push into Undo Stack
        nn.next = US;
        US = nn;

        // New operation destroys Redo history
        RH = null;
    }


    // =========================
    // UNDO
    // =========================

    public void UNDO() {

        if (US == null) {
            return;
        }

        // Get latest action
        Node action = US;

        // Remove action from Undo Stack
        US = US.next;
        action.next = null;

        // Reverse the action in the document
        if (action.operation == 'T') {

            delete(action.data);

        } 
        else if (action.operation == 'D') {

            insert(action.data, action.index);
        }

        // Move same action to Redo Stack
        push(action);
    }


    // =========================
    // REDO STACK
    // =========================

    public void push(Node nn) {

        nn.next = RH;
        RH = nn;
    }


    public Node pop() {

        if (RH == null) {
            return null;
        }

        Node temp = RH;

        RH = RH.next;
        temp.next = null;

        return temp;
    }


    // =========================
    // REDO
    // =========================

    public void REDO() {

        if (RH == null) {
            return;
        }

        // Take latest undone action
        Node action = pop();

        // Reapply the action to the document
        if (action.operation == 'T') {

            add(action.data);

        } 
        else if (action.operation == 'D') {

            delete(action.data);
        }

        // Move the action back to Undo Stack
        action.next = US;
        US = action;
    }
}