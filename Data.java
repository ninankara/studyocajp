public class Data {
    private int value=0;

    public Data(int value){
        this.value = value;
    }

    //if equals function is overidden , it will compare literally
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        return this.value==((Data) obj).value;
    }

}
