package reflection.validate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
public class ObjectValidateExpression extends ValidateExpression {
    private List<ValidateExpression> validateExpressions = new ArrayList<ValidateExpression>();
    private String object;

    public List<ValidateExpression> getValidateExpressions() {
        return validateExpressions;
    }

    public void setValidateExpressions(List<ValidateExpression> validateExpressions) {
        this.validateExpressions = validateExpressions;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
