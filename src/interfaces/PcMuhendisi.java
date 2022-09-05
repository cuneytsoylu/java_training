package interfaces;

public class PcMuhendisi implements IMuhendis,ikinci{
   private boolean askerlik;
   private boolean referans;

   public PcMuhendisi(boolean askerlik, boolean referans) {
      this.askerlik = askerlik;
      this.referans = referans;
   }


   @Override
   public void referansSorgula() {
      if(referans){
         System.out.println("referansim var");
      }else {
         System.out.println("referansim yoktur");
      }

   }

   @Override
   public void askerlikDurumuSorgula() {
if(askerlik){
   System.out.println("askerliğimi yaptım");
}else{
   System.out.println("askerliğimi yapmadim");
}
   }

   @Override
   public String mezuniyetOrtalmasi(double derece) {
      return "ortalamam : "+ derece;
   }

   @Override
   public void isTecrubesi(String[] array) {

      for (int i = 0; i < array.length ; i++) {
         System.out.println(array[i]);
      }

   }



   public static void main(String[] args) {
      PcMuhendisi muhendis=new PcMuhendisi(true,true);

     // IMuhendis muhendis1=new PcMuhendisi(true,true);


      muhendis.askerlikDurumuSorgula();
      System.out.println(muhendis.mezuniyetOrtalmasi(3.05));
     muhendis.referansSorgula();


      String [] tecrube={"tubitak","kamu sektoru","arcelik"};
      muhendis.isTecrubesi(tecrube);
   }


   @Override
   public void rastgele1() {

   }
}
