public class Quest1 {
        private int qQ;
        public Quest1(int q) {
            qQ = 12 / q;//1
        }
        public int getQQ() {
            return qQ;//2
        }
        public static void main(String[] args) {
            Quest1 quest1 = null;
            try {
                quest1 = new Quest1(0);
            } catch (Exception e) {//4
            }
            System.out.println(quest1.getQQ());//5
        }
    }

