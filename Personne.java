package ExEtud;

public abstract  class Personne {
    private String nom, prenom, addresse;
    private int age;

    public Personne(String nom, String prenom, String addresse, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
