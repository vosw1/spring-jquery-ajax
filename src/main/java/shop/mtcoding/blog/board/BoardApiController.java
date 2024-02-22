package shop.mtcoding.blog.board;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController // 데이러틀 리턴
public class BoardApiController {
    private final BoardRepository boardRepository; // DI

    // 주소 만들기
    @GetMapping("api/boards") // 보드 줘라는 주소, 복수는 보드들 줘, 보드들 중에 1번 줘해서 복수형을 씀
    public ApiUtil<List<Board>> findAll(HttpServletResponse response) {
        //response.setStatus(401);
        List<Board> boardList = boardRepository.selectAll(); // 상태코드랑 메세지랑 같이 줘야함
        return new ApiUtil<>(boardList); // MessageConverter라는 클래스가 오브젝트를 응답할때 자동 발동함
    }
}