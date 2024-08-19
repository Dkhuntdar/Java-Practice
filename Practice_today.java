//public class Practice_today{
    class box{
    double height;
    double width;
    double length;
}
    
    class boxdemo2{
        public static void main(String[] args) {
        box mybox1= new box();
        box mybox2=new box();
        double vol;

        mybox1.height=10;
        mybox1.width=20;
        mybox1.length=15;
        mybox2.height=3;
        mybox2.width=6;
        mybox2.length=9;
        vol=mybox1.height*mybox1.width*mybox1.length;
        System.out.println(vol);
        vol=mybox2.height*mybox2.width*mybox2.length;
        System.out.println(vol);
    }
}

