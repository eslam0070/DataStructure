package DataStructure.Array;

public class SimpleArray  {
    public static void main(String[] args) {
        //One Dimesion Array
        System.out.println("Simple Array");
        int[] number = new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        for (int i=0;i<number.length;i++)
            System.out.print(number[i] +"\n");

        //Array of object
        System.out.println("\nObject Array");
        Students[] students = new Students[3];
        students[0]= new Students("Eslam",1);
        students[1]= new Students("android",2);
        students[2]= new Students("java",3);
        for (Students student1: students) {
            System.out.println("Name: " +student1.name +", id:"+ student1.id);
        }
        //Two diemsion
        System.out.println("\nTwo diemsion Array");
        int[][] data = new int[3][3];
        data[0][0]=44;
        data[0][1]=65;
        data[0][2]=1;
        data[1][0]=58;
        data[1][1]=47;
        data[1][2]=14;
        data[2][0]=47;
        data[2][1]=25;
        data[2][2]=10;
        for (int i=0;i<3;i++){
            for (int k = 0;k<3;k++)
                System.out.println(data[i][k] + "\t");
            System.out.println("\n");
        }
    }

}
