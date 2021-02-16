package ClassExample;

public class EltroMobile extends yengilAvto{
    private Long zaryadSigimi;

    public EltroMobile(Long i) {
        this.zaryadSigimi = i;
    }

    public EltroMobile(Long i, String s, String s1, double v) {
        this.zaryadSigimi = i;
        super.uzunligi = s;
        super.hajmi = s1;
        super.kuchi = v;
    }

    public EltroMobile(long i, String s, String s1, double v, String qora, String bmw) {
        this.zaryadSigimi = i;
        super.uzunligi = s;
        super.hajmi = s1;
        super.kuchi = v;
        super.rangi = qora;
        super.modeli = bmw;
    }

    public void info(){
        System.out.println("zayradi " + zaryadSigimi);
        System.out.println("uzunligi " + uzunligi);
        System.out.println("hajmi " + hajmi);
        System.out.println("kuchi " + kuchi);
    }
}
