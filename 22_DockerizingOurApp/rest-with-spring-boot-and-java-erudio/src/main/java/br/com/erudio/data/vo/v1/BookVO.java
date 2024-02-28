package br.com.erudio.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@JsonPropertyOrder({"id", "author", "launchDate", "price", "title"})
public class BookVO extends RepresentationModel<BookVO> implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;

        @JsonProperty("id")
        @Mapping("id")
        private Long key;
        private String author;
        private Date launchDate;
        private Double price;
        private String title;


        public BookVO() {} // Constructor padrão que o JPA exige.

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookVO bookVO)) return false;

        if (getKey() != null ? !getKey().equals(bookVO.getKey()) : bookVO.getKey() != null) return false;
        if (getAuthor() != null ? !getAuthor().equals(bookVO.getAuthor()) : bookVO.getAuthor() != null) return false;
        if (getLaunchDate() != null ? !getLaunchDate().equals(bookVO.getLaunchDate()) : bookVO.getLaunchDate() != null)
            return false;
        if (getPrice() != null ? !getPrice().equals(bookVO.getPrice()) : bookVO.getPrice() != null) return false;
        return getTitle() != null ? getTitle().equals(bookVO.getTitle()) : bookVO.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result = getKey() != null ? getKey().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getLaunchDate() != null ? getLaunchDate().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        return result;
    }
}
