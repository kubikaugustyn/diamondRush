// 
// Decompiled by Procyon v0.5.36
// 

public final class k extends Thread
{
    private final String a;
    
    public k(final String a) {
        this.a = a;
    }
    
    public final void run() {
        boolean equals;
        try {
            equals = i.a.getAppProperty("APP-RUNNING-ON-PLATFORMREQUEST").trim().equals("0");
        }
        catch (Exception ex) {
            equals = false;
        }
        try {
            if (equals) {
                GloftDIRU.a = this.a;
                i.b = 3;
                return;
            }
            i.a.platformRequest(this.a);
        }
        catch (Exception ex2) {
            GloftDIRU.a = this.a;
        }
    }
}
