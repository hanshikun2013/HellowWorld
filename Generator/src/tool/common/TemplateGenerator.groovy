package tool.common

import org.apache.velocity.Template
import org.apache.velocity.VelocityContext
import org.apache.velocity.app.Velocity

import tool.model.SampleModel;

class TemplateGenerator {

	def TEMPLATE_FILE_DIRECTORY ;
	public TemplateGenerator(String template) {
		TEMPLATE_FILE_DIRECTORY=template
	}
	public void  generateFile(VelocityContext context,String templatePah,String outputFile){
		Velocity.setProperty("file.resource.loader.path", TEMPLATE_FILE_DIRECTORY);

		Velocity.init();
		File f=new File(outputFile )
		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		OutputStreamWriter writer = new OutputStreamWriter( new FileOutputStream(f), "UTF-8");

		// テンプレートを作成
		Template tmplate = Velocity.getTemplate(templatePah , "UTF-8");
		// データを生成し、結果をwriterに出力
		tmplate.merge(context, writer);
		writer.close();
	}
}
