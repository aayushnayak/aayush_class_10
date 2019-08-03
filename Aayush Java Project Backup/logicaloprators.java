class logicaloprators{
public static void main(String args[]){
 int boy,girl;
 boy=18;
 girl=40;
 if(boy>10){
     System.out.println("you can enter");
    }
    else{
    System.out.println("you are too young");
    }
    
 if(boy>10 && girl<60){
     System.out.println("you can enter");
    }
    else{
    System.out.println("you cannot enter");
    }
 if(boy>78 || girl<23){
     System.out.println("you can enter");
    }
    else{
    System.out.println("you cannot enter");
    }
}
}