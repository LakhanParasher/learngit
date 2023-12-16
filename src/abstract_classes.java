public class abstract_classes {
    private int [] data;

private static int Default_size=10;
private  int size=0;

    public abstract_classes() {
        this.data = new int[Default_size];

    }
    private boolean isFull(){
        return size == data.length;

    }
    private  void resize(){
//        int[] ints = new int[data.length * 2];
        int [] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public void add(int num){
        if (isFull()) {
            resize();

        }
        data[size++]=num;

    }
    public int remove(){
        int removed =data[--size];
        return  removed;
    }


}
