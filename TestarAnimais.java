public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f, "Vegetação");
        camelo.dadosMamifero();
        Mamifero mamifero = new Mamifero("vaca", 2.5f, 4, "Marrom", "pasto", 15.0f, "Capin");
        mamifero.dadosMamifero();
        Peixe peixe = new Peixe("Tubarão", 300f, 0, "Cinza", "Mar", 1.5f, "Babatanas e cauda");
        peixe.dadosPeixe();
        Mamifero Urso = new Mamifero("Urso-do-Canadá", 180, 4, "vermelho", "terra", 0.5f, "mel");
        mamifero.dadosMamifero();

    }
}