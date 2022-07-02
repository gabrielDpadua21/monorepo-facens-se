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
  
  const HelpCv = () => {
    return (
      <>
        <SlowHeader title="Dicas para montar seu currículo"/>
        <Container className="mt--7" fluid>
          <Row>
            <Col className="order-xl-1" xl="12">
              <Card className="bg-secondary shadow">
                <CardHeader className="bg-white border-0">
                  <Row className="align-items-center">
                    <Col xs="8">
                      <h2 className="mb-0">Dicas de como criar curriculo</h2>
                    </Col>
                  </Row>
                </CardHeader>
                <CardBody>
                    <h6 className="heading-small text-muted mb-4">
                      Coloque informações precisas 
                    </h6>
                    <p className="mt-0 mb-2">
                      Depois dos dados pessoais e antes da descrição de suas experiências e formação, é legal apresentar uma área de atuação bem definida, com bom destaque, usando poucas palavras. Essa informação deve comunicar, de maneira rápida e genérica, com o que você trabalha
                    </p>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                      Economize nos dados pessoais 
                    </h6>
                    <p className="mt-0 mb-2">
                      Usando poucas palavras, faça um resumo das suas principais qualificações, descrevendo as áreas de atuação e seu papel em cada uma delas
                    </p>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                      Faça um resumo das suas qualificações 
                    </h6>
                    <p className="mt-0 mb-2">
                      Se você tem cursos técnicos, experiências internacionais, ou participação em eventos que possam turbinar as chances de ganhar a vaga, liste-os no fim do currículo. Não precisa encher de detalhes nem fazer uma lista comprida de eventos. Basta colocar o título, a instituição, o local e a data
                    </p>
                </CardBody>
              </Card>
            </Col>
          </Row>
        </Container>
      </>
    );
  };
  
  export default HelpCv;
  