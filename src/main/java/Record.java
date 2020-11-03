
    public abstract class Record implements Printer {
        private int id;
        public Record(int id) {
        this.id = id;
        System.out.println("Record " + id);
    }

    public int getId() {
        return id;
    }
}
