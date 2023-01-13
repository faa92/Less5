public class incPolei {

                                                        //Иниц. полей в классе
        int volume;
        double prise;
        String name;




                                                                //в блоке иниц.
        {volume=3;
        prise=3.0;
        name="Block";}



                                                                // в конструкторе
        public incPolei (){
                volume=2;
                prise=2.0;
                name="Construktor";


        }
        public void getInfo() {
                System.out.println();
        }

        public int doPlus (int input){                          //см фото в телефоне
             if (input==100)
                     return input;
             return doPlus(input+1);

        }


}



