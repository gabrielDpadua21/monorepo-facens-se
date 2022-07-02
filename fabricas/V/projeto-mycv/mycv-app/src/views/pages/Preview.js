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
  import { useHistory } from 'react-router-dom';

  const Preview = () => {
    const history = useHistory();

    const backToList = () => {
        history.push('/admin/home');
    }

    return (
      <>
        <SlowHeader title="Preview" />
        {/* Page content */}
        <Container className="mt--7" fluid>
        <Row>
          <Col className="order-xl-1" xl="12">
            <Card className="bg-secondary shadow">
              <CardHeader className="bg-white border-0">
                <Row className="align-items-center">
                  <Col xs="8">
                    <h3 className="mb-0">Preview do Projeto Curriculo 1</h3>
                  </Col>
                  <Col className="text-right" xs="4">
                    <Button
                      color="primary"
                      href="#pablo"
                      onClick={backToList}
                      size="sm"
                    >
                      Voltar
                    </Button>
                  </Col>
                </Row>
              </CardHeader>
              <CardBody>
                <Row className="justify-content-center">
                    <Col xs="8">
                      <img
                            alt="..."
                            className="image-preview"
                            src={
                            require("../../assets/img/logo/preview.png")
                                .default
                            }
                        />
                    </Col>
                </Row>
              </CardBody>
            </Card>
          </Col>
        </Row>
        </Container>
      </>
    );
  };
  
  export default Preview;
  