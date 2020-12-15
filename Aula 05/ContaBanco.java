public class ContaBanco{

    public int numeroConta;
    protected String tipo;
    private float saldo;
    private boolean status;
    private String dono;
    ContaBanco()
    {
        this.numeroConta = 0;
        this.tipo = null;
        this.saldo = 0.00f;
        this.status = false;
        this.dono = null;
    }
    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumero() {
        return this.numeroConta;
    }

    public void setNumero(int numero) {
        this.numeroConta = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     public ContaBanco(int n, String t, float s, boolean st ){
         this.numeroConta = n;
         this.tipo = t;
         this.saldo = s;
         this.status = st;
    }
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(this.tipo == "CC")
        {
            this.setSaldo(50);
        }
        else if(this.tipo == "CP")
        {
            this.setSaldo(150);
        } 
        System.out.println("Conta Aberta");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0 )
        {
            System.out.println("Conta com dinheiro esvazia essa porra animal");
        }
        else if(this.getSaldo() < 0 )
        {
            System.out.println("Conta está em débito");
        }
        else{
            this.setStatus(false);
        }
    }
    public void depositar(float d){
        if(this.isStatus())
        {
            this.setSaldo(this.getSaldo() + d); 
        }
        else
        {
            System.out.println("A conta está desativada animal!!!");
        }
    }
    public void sacar(float v){
        if(this.isStatus())
        {
            if(this.getSaldo() > 5)
            {
                this.setSaldo(this.getSaldo() - v);
            }
            else
            {
                System.out.println("Você não têm Saldo suficiente para saque!!!");
            }
        }
        else
        {
            System.out.println("Conta inativa");
        }
    }

    public void pagarMensal(){
        float v;
        if(this.isStatus()){
            if(this.getTipo() == "CC"){
                v = 12f;
            }
            else{
                v = 20f;
            }
             if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }
            else{
                System.out.println("Impossível pagar!!!");
            }
        }
        else{
            System.out.println("Conta inválida!!");
        }

    }
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumero());        
        System.out.println("Nome: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("---------------------------");

    }
}