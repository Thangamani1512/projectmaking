class Bank {

    int customerId;
        String name;

        Bank(int customerId, String name) {
            this.customerId = customerId;
            this.name = name;
        }

        void display() {
            System.out.println("Customer ID: " + customerId + " " + "Name: " + name);
        }
    }


