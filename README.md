# 添加MVC框架

## 1.将mvc系统demo与spring-batch合并，配置pom.xml
## 2.修改controller内容，为batch添加启动器
  ```
  @RequestMapping(value = "/batch", method = RequestMethod.GET)
	public ModelAndView execute() {
		ModelAndView model = new ModelAndView();
        String[] springConfig = { "spring/batch/jobs/job-hello-world.xml" };	
        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("helloWorldJob");
   ```
   ```
   model.setViewName("batch");
   ```
## 3.修改hello.jsp当中的btn链接
        <p>
          <a class="btn btn-primary btn-lg" href="http://localhost:8080/batch" role="button">Start batch</a>
        </p>
     


