package br.com.erudio.integrationtests.vo.book;

import br.com.erudio.integrationtests.vo.person.PersonVO;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement
public class PagedModelBook {

    @XmlElement(name = "content")
    private List<BookVO> content;

    public PagedModelBook() {}

    public List<BookVO> getContent() {
        return content;
    }
}