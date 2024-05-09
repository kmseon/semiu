
//조건 확인========================
//수강 신청 선택 과목 안보이게 하는 상태

//수강 신청 선택 과목 내역에 추가
function add(){
    const table = document.getElementById('lecture');
    const addLecture = document.getElementById('addLecture');
    const new_row = addLecture.insertRow();
    const cell_length = table.rows[1].cells.length;
   for(let i = 0; i < cell_length; i++) {
           const new_cell = new_row.insertCell(i);
           let temp_html = ``;
           if(i === 0) {
                   temp_html = `<td>*{id}</td>`;
           } else if(i === 1) {
                   temp_html = `<td th:text="*{professor.name}"></td>`;
           } else if(i === 2) {
                    temp_html = `<td th:text="*{classroom.id}"></td>`;
           } else if(i === 3) {
                    temp_html = `<td th:text="*{subjectType}"></td>`;
           } else if(i === 4) {
                    temp_html = `<td th:text="*{credit}"></td>`;
           } else if(i === 5) {
                    temp_html = `<td th:text="*{dayOfWeek}"></td>`;
           } else if(i === 6) {
                     temp_html = `<td th:text="*{startTime}"></td>`;
           } else if(i === 7) {
                     temp_html = `<td th:text="*{endTime}"></td>`;
           } else if(i === 8) {
                      temp_html = `<td th:text="*{maxStudent}"></td>`;
           } else if(i === 9) {
                      temp_html = ` <td th:text="*{totalStudent}"></td>`;
           } else {
                     temp_html = `<td><button th:unless="*{maxStudent == totalStudent}"
                                   id="cancel" onClick={handleRegister}>취소</button></td>`;
           };
           alert(temp_html);
           new_cell.insertAdjacentHTML('beforeend', temp_html);
    }
}
