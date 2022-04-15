package main;

import prototype.Autobuz;

public class Main {

    public static void main(String[] args) {

        //StringBuilder builder = new StringBuilder();
        //builder.append("Ana").append("are").append("mere.");

        Autobuz autobuz = new Autobuz("Andrei");
        Autobuz autobuz2;
        {
            try{
                autobuz2=(Autobuz)autobuz.copiaza();
                autobuz2.setSoferAutobuz("Matei");
                System.out.println(autobuz.getSoferAutobuz());
                System.out.println(autobuz2.getSoferAutobuz());
            }
            catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
        }



    }

}
