package bdbt_bada_project.SpringApplication.DTO;

import bdbt_bada_project.SpringApplication.Models.Match;
import bdbt_bada_project.SpringApplication.Models.Stadium;

public class MatchBuyingDTO {
    private Match match;
    private Stadium stadium;
    private int nr_kibica;

    public MatchBuyingDTO(Match match, Stadium stadium, int nr_kibica) {
        this.match = match;
        this.stadium = stadium;
        this.nr_kibica = nr_kibica;
    }

    public int getNr_kibica() {
        return nr_kibica;
    }

    public void setNr_kibica(int nr_kibica) {
        this.nr_kibica = nr_kibica;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "MatchBuyingDTO{" +
                "match=" + match +
                ", stadium=" + stadium +
                '}';
    }
}
