package snippet;

public class Snippet {
	<tr>
		<td><label for="gender">性別</label></td>
		<td><input type="radio" name="gender" th:field="*{gender}" id="radioA" value="男性"/>
		<label for="radioA">男性</label>
		<input type="radio" name="gender" th:field="*{gender}" id="radioB" value="女性"/>
		<label for="radioB">女性</label>
	        </td>
	</tr>
}

