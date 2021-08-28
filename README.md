Curso prático onde criamos uma aplicação desde o começo com a linguagem **Java** e **Spring Boot**, juntamente com o deploy na AWS utilizando os seguintes serviços: **ECS**, **DynamoDB**, **SNS**, **SQS**, **RDS**, **VPC**, **Cluster**, **CDK**, **Application Load Balancer**;

Sistema composto por dois serviços:

**AWS_PROJECT01:** aplicação responsável pelo CRUD de produtos, onde os produtos cadastrados são salvos em uma base de dados no RDS e, após esse processo, postamos uma mensagem em um tópico, notificando o usuário que houve um evento de cadastro/atualização/deleção, através do Serviço SNS da AWS;

**AWS_PROJECT02:** aplicação responsável por consumir os eventos produzidos pela primeira aplicação e salvá-los em uma base no Dynamo DB, que pode ser consultada através de requisições Http nessa mesma aplicação;

**CURSO_AWS_CDK:** aplicação responsável pela configuração das Stacks da AWS que foram utilizadas nos dois serviços (citados acima);

Em complemento, para esse curso, utilizei o Docker como repositório das imagens das aplicações. Ao realizar o deploy das Stacks na AWS, já utilizo a última imagem da aplicação que foi enviada para o Docker Hub.

Conceitos adquiridos durante o curso:

- Criar microsserviços utilizando AWS ECS e Fargate, o Serverless compute for containers da AWS;
- Construir infraestrutura na AWS com AWS CDK - Cloud Development Kit;
- Publicar eventos em tópicos utilizando o AWS SNS;
- Persistir eventos utilizando o AWS DynamoDB;
- Configurar opções de auto-scaling de tabelas do DynamoDB;
- Criar um application load balancer para dividir o tráfego entre várias instâncias da aplicação;
- Monitorar serviços como SQS, ALB e DynamoDB através de seus gráficos e métricas;
- Criar microsserviços baseadas em containers Docker e utilizar o AWS ECS;
- Persistir dados em uma instância do MySQL construída com o AWS RDS;
- Consumir eventos em filas utilizando o AWS SQS;
- Construir um mecanismo de importação de arquivos utilizando o AWS S3;
- Configurar chaves compostas nas tabelas do DynamoDB;
- Monitorar serviços construídos com AWS ECS utilizando CloudWatch Insights;
- Testar aplicações localmente, simulando os serviços da AWS com o LocalStack;
