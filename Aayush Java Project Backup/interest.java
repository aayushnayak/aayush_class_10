class interest
{
    public static void main(String [] args)
    {
        double amount=0,principal=100,rate=.1,time= 1,ci,compound=12;
        amount = principal * (Math.pow((1 + (rate/compound)),(time * compound)));
        ci = amount - principal;
        System.out.println("compound interst = "+ci);
        

}
}
