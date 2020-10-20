package hex.genmodel.attributes;

import com.google.gson.JsonObject;
import hex.genmodel.MojoModel;

public class ModelAttributesGLM extends ModelAttributes {

  public final Table _coefficients_table;
  private final VariableImportances _variableImportances;

  public ModelAttributesGLM(MojoModel model, JsonObject modelJson) {
    super(model, modelJson);
    _coefficients_table = ModelJsonReader.readTable(modelJson, "output.coefficients_table");
    _variableImportances = VariableImportances.extractFromJson(modelJson);
  }

  public VariableImportances getVariableImportances(){
    return _variableImportances;
  }

}
