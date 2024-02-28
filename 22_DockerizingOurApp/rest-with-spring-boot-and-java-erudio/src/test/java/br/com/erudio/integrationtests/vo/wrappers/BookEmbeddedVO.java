package br.com.erudio.integrationtests.vo.wrappers;

import br.com.erudio.integrationtests.vo.BookVO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class BookEmbeddedVO implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;

        @JsonProperty("bookVOList")
        private List<BookVO> books;

        public BookEmbeddedVO() {}

        public List<BookVO> getBooks() {
            return books;
        }

        public void setBooks(List<BookVO> books) {
            this.books = books;
        }
}
