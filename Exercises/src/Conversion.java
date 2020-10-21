

public class MyConversionClass {

    private ArrayList<MyClass> myObjects;


    public MyConversionClass(){
        myObjects = new ArrayList<MyClass>();
    }

    public void ConvertArray(MyClass [] myObjects ){

        int length = myObjects.length;

        for(int i = 0; i<length;i++){

            this.myObjects.add(myObjects[i]);
        }

    }


}
