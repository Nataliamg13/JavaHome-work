package HM28;
    public abstract class Insurance {
        public void Insurance(String insuranceName) {
            this.insuranceName = insuranceName;

        }

        public String insuranceName;

        public abstract void getQuote();
        public abstract void cancelInsurance();
    }

    class Car extends Insurance {
        public Car(String carModel) {
            this.carModel = carModel;
        }

        public String carModel;

        @Override
        public void getQuote() {
            System.out.println("Car method");

        }

        @Override
        public void cancelInsurance() {
            System.out.println("Cancel car");

        }

    }

    class Pet extends Insurance {
        public Pet(String petType) {
            this.petType = petType;
        }

        public String petType;
        public void cancelInsurance() {
            System.out.println("Cancel Pet");

        }

        @Override
        public void getQuote() {
            System.out.println("Pet method");

        }

    }

    class Health extends Insurance {
        public Health(String healthName) {
            insuranceName = healthName;
        }
        public void cancelInsurance() {
            System.out.println("Cancel Health");

        }

        @Override
        public void getQuote() {
            System.out.println("Health method");

        }

    }


