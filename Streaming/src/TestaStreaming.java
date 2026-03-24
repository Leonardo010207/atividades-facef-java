public class TestaStreaming {
    public void main(String[] args) {
        Streaming s1 = new Streaming("Leonardo", "Premium");
        s1.assistirFilme("A grande aposta");
        s1.cancelarAssinatura();
        s1.assistirFilme("Até o último homem");
        System.out.println(s1);
    }
}