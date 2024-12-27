package web.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Merch {
    private Long id;

    private String name;

    private Long count;
}
