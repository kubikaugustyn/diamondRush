public final class k extends Thread {
  private final String a;
  
  public k(String paramString) {
    this.a = paramString;
  }
  
  public final void run() {
    boolean bool;
    try {
      bool = i.a.getAppProperty("APP-RUNNING-ON-PLATFORMREQUEST").trim().equals("0");
    } catch (Exception exception) {
      bool = false;
    } 
    try {
      if (bool) {
        GloftDIRU.a = this.a;
        i.b = true;
        return;
      } 
      i.a.platformRequest(this.a);
      return;
    } catch (Exception exception) {
      GloftDIRU.a = this.a;
      return;
    } 
  }
}


/* Location:              C:\Users\Radek Augustyn\Desktop\Nokia 6303i classic_2022-03-06\Settings\predefjava\predefgames\diamond_EUD.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */