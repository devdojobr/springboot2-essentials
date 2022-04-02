package academy.devdojo.springboot2.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
