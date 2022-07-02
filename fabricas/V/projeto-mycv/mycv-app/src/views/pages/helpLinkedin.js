import {
    Button,
    Card,
    CardHeader,
    CardBody,
    FormGroup,
    Form,
    Input,
    Container,
    Row,
    Col,
  } from "reactstrap";

  import SlowHeader from "components/Headers/SlowHeader";
  
  const HelpLinkedin = () => {
    return (
      <>
        <SlowHeader title="Dicas para montar seu Linkedin"/>
        <Container className="mt--7" fluid>
          <Row>
            <Col className="order-xl-1" xl="12">
              <Card className="bg-secondary shadow">
                <CardHeader className="bg-white border-0">
                  <Row className="align-items-center">
                    <Col xs="8">
                      <h2 className="mb-0">Dicas de como criar um perfil Top no linkedin</h2>
                    </Col>
                  </Row>
                </CardHeader>
                <CardBody>
                    <h6 className="heading-small text-muted mb-4">
                      Preencha todas as informações do seu perfil
                    </h6>
                    <p className="mt-0 mb-2">
                      A parte visual inicial são fotos de capa e perfil. Para o perfil, sempre utilize uma imagem de 400x400 com fundo neutra, de rosto ou até o peito, olhando para a câmera e sorrindo; para a capa, pode escolher uma foto realizando alguma atividade, ministrando uma conferência ou no seu escritório, cuja medida seja de 1584x396.
                    </p>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                      Utilize palavras-chave estratégicas 
                    </h6>
                    <p className="mt-0 mb-2">
                      O resumo é o texto que o LinkedIn oferece para explicar quem você é a que você se dedica. É a parte que deve convencer quem visita o seu perfil a contratar você ou a se tornar um cliente. Inclua um resumo de sua trajetória pessoal redigido em primeira pessoa para gerar empatia, e coloque o mais relevante nas primeiras três linhas para cativar a pessoa que o ler. Depois, acrescente sua função atual, aprendizados
                    </p>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                     Insira sua formação 
                    </h6>
                    <p className="mt-0 mb-2">
                      Se você está buscando emprego ou projetos, mostre que está procurando essas oportunidades profissionais, mas não coloque isso no cabeçalho. Acrescente datas aos seus trabalhos antigos e um posto atual relacionado à sua profissão para se posicionar melhor.
                    </p>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                     Faça um resumo das suas experiências
                    </h6>
                    <p className="mt-0 mb-2">
                      Quanto ao seu posto atual, acrescente tudo o que tiver e tente fazer ligações com as páginas das empresas para as quais trabalha, inclusive se for sua própria.
                    </p>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </Container>
      </>
    );
  };
  
  export default HelpLinkedin;
  