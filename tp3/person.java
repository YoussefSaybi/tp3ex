public class person {
        public String name;
        public String firstName;
        public int dayNaiss;
        public int monthNaiss;
       public int yearNaiss;
        public person(String name, String firstName, int dayNaiss, int monthNaiss, int yearNaiss) {
            this.name = name;
            this.firstName = firstName;
            this.dayNaiss = dayNaiss;
            this.monthNaiss = monthNaiss;
            this.yearNaiss = yearNaiss;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }


        public void setDateNaiss(int dayNaiss, int monthNaiss, int yearNaiss) {
            this.dayNaiss = dayNaiss;
            this.monthNaiss = monthNaiss;
            this.yearNaiss = yearNaiss;
        }

        public int ageEn2023() {
            int age = 2023 - yearNaiss;
            if (monthNaiss > 12 || (monthNaiss == 12 && dayNaiss > 31)) {
                return -1;
            }
            if (monthNaiss == 12) {
                if (dayNaiss > 31) {
                    return -1;
                }
            } else if (monthNaiss == 11 || monthNaiss == 9 || monthNaiss == 6 || monthNaiss == 4) {
                if (dayNaiss > 30) {
                    return -1;
                }
            } else if (monthNaiss == 2) {
                if (yearNaiss % 4 == 0) {
                    if (dayNaiss > 29) {
                        return -1;
                    }
                } else {
                    if (dayNaiss > 28) {
                        return -1;
                    }
                }
            } else {
                if (dayNaiss > 31) {
                    return -1;
                }
            }
            return age;
        }
    }

