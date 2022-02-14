public class Playlist extends Song {
    public String pause() {
        return "Se Pauso La Cancion";
    }

    public String play() {
        return "Se Esta Reproduciendo";
    }

    public String forward() {
        return "Se Adelanto la cancion 10s";
    }

    public String backlog() {
        return "Se Atrazo la cancion 10s";
    }
    public String filterGender(){
        return "filtrar genero";
    }
    public String filterYear(){
        return"Filtrar Año";
    }
}
