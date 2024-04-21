package hello.itemservice.domain.item;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
public enum ItemType {

    BOOK("도서"), FOOD("식품"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }
}
