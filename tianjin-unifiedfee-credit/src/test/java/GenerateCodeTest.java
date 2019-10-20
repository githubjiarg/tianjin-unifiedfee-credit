

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import cn.taiji.generator.GenerateCodeUtil;
import cn.taiji.generator.generate.impl.view.AddGenerator;
import cn.taiji.generator.generate.impl.view.ManageGenerator;
import cn.taiji.generator.generate.impl.view.ManageSearchGenerator;
import cn.taiji.generator.generate.impl.view.UpdateGenerator;
import cn.taiji.generator.generate.impl.view.ViewGenerator;
import cn.taiji.generator.generate.inter.GenerateHandler;
import cn.taiji.generator.generate.param.GenerateParam;
import cn.tianjin.unifiedfee.credit.domain.XyglFirmportrait;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients({"cn.taiji","cn.tianjin.unifiedfee"})
@ComponentScan({"cn.taiji","cn.tianjin.unifiedfee"})
public class GenerateCodeTest {
	public static void main(String[] args) {
		//自己放置文件的地址
		String path = "E:\\demo";
		Class<?> clazz = XyglFirmportrait.class;//数据库映射类
		//生成全部文件
		GenerateCodeUtil.bulid(clazz, path);
		//生成部分文件
		GenerateParam generateParam = new GenerateParam(clazz.getName(), path);
		List<GenerateHandler> generateHandlers = new ArrayList<GenerateHandler>() {
			private static final long serialVersionUID = 1L;
			{
//				// java文件
//				add(new RepositoryGenerator());
//				add(new ServiceGenerator());
//				add(new ServiceImplGenerator());
//				add(new ControllerGenerator());
//				add(new ApiControllerGenerator());

				// html文件
				add(new ManageGenerator());
				add(new ManageSearchGenerator());
				add(new AddGenerator());
				add(new UpdateGenerator());
				add(new ViewGenerator());
			}
		};
		generateParam.setGenerateHandlers(generateHandlers);
		GenerateCodeUtil.bulid(generateParam);
	}
}
