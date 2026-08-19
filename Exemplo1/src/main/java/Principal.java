public class Principal {

    public static void main(String[] args) {
        Banco b1 = new Banco ("Mikael", "00000", 15);
        Banco b2 = new Banco ();
        Banco b3 = new Banco ("Carlos", "144000", 22);

        System.out.println(b3.getNome());
        b3.setNome("Douglas");
        System.out.println(b3.getNome());

    }

}
