public class computer implements electronic{

    RAM ram;
    processor processor;

    public computer(RAM ram, processor processor, storage storage) {
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "computer{" +
                "ram=" + ram.name +
                ", processor=" + processor +
                ", storage=" + storage.capacity +
                '}';
    }

    storage storage;

    @Override
    public boolean on(){
        return true;
    }
    @Override
    public boolean off(){
        return false;
    }
}
