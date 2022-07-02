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
  
  const Maker = () => {    
    return (
      <>
        <SlowHeader title="Criar novo projeto" />
        <Container className="mt--7" fluid>
          <Row>
            <Col className="order-xl-1" xl="12">
              <Card className="bg-secondary shadow">
                <CardHeader className="bg-white border-0">
                  <Row className="align-items-center">
                    <Col xs="8">
                      <h3 className="mb-0">Nome do projeto</h3>
                    </Col>
                    <Col className="text-right" xs="4">
                    <Input
                        className="form-control-alternative"
                        id="input-projectName"
                        placeholder="Nome do Projeto"
                        type="text"
                    />
                    </Col>
                  </Row>
                </CardHeader>
                <CardBody>
                  <Form>
                    <h6 className="heading-small text-muted mb-4">
                      Informações de perfil
                    </h6>
                    <div className="pl-lg-4">
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-username"
                            >
                              Nome completo
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-username"
                              placeholder="Nome completo"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-email"
                            >
                              Email
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-email"
                              placeholder="fulano@example.com"
                              type="email"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-phone"
                            >
                              Telefone
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-phone"
                              placeholder="(00)00000-0000"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-linkedin"
                            >
                              Linkedin
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-linkedin"
                              placeholder=""
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                    </div>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                      Endereço
                    </h6>
                    <div className="pl-lg-4">
                      <Row>
                        <Col md="12">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-address"
                            >
                              Endereço
                            </label>
                            <Input
                              className="form-control-alternative"
                              defaultValue="Rua X, numero X ...."
                              id="input-address"
                              placeholder="Endereço"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <Row>
                        <Col lg="4">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-city"
                            >
                              Cidade
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-city"
                              placeholder="SP"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="4">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-country"
                            >
                              País
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-country"
                              placeholder="Brasil"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="4">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-postal-code"
                            >
                              CEP
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-postal-code"
                              placeholder="00000-000"
                              type="number"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                    </div>
                    <hr className="my-4" />
                    {/* Description */}
                    <h6 className="heading-small text-muted mb-4">Informações importantes</h6>
                    <div className="pl-lg-4">
                     <FormGroup>
                        <label
                            className="form-control-label"
                            htmlFor="input-work"
                        >
                            Cargo Desejado
                        </label>
                        <Input
                            className="form-control-alternative"
                            id="input-work"
                            placeholder="Engenheiro de Software Senior"
                            type="text"
                        />
                        </FormGroup>
                      <FormGroup>
                        <label>Sobre mim</label>
                        <Input
                          className="form-control-alternative"
                          placeholder="Um pouco sobre mim"
                          rows="4"
                          defaultValue=""
                          type="textarea"
                        />
                      </FormGroup>
                    </div>
                    {/* EXPERIENCIA */}
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">Experiencias profissionais</h6>
                    <div className="pl-lg-4">
                     <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-cargo"
                            >
                              Cargo
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-cargo"
                              placeholder="Exemplo: Engenheiro de Software"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-empresa"
                            >
                              Empresa
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-empresa"
                              placeholder="Nome da empresa"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <h6 className="heading-small text-muted mb-4">Data de inicio</h6>
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-init-month"
                            >
                              Mês
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-init-month"
                              placeholder="Janeiro"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-init-year"
                            >
                              Ano
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-init-year"
                              placeholder="2020"
                              type="number"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <h6 className="heading-small text-muted mb-4">Data de término</h6>
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-end-month"
                            >
                              Mês
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-end-month"
                              placeholder="Janeiro"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-end-year"
                            >
                              Ano
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-end-year"
                              placeholder="2020"
                              type="number"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <FormGroup>
                        <label>Descrição da função</label>
                        <Input
                          className="form-control-alternative"
                          placeholder="Descreva a função do seu antigo cargo aqui..."
                          rows="4"
                          defaultValue=""
                          type="textarea"
                        />
                      </FormGroup>
                    </div>
                    {/* FORMAÇÃO */}
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">Formação academica</h6>
                    <div className="pl-lg-4">
                     <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-formation"
                            >
                              Formação
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-formation"
                              placeholder="Engenharia da computação"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-college"
                            >
                              Instituição
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-college"
                              placeholder="FACENS"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <h6 className="heading-small text-muted mb-4">Data de inicio</h6>
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-init-month"
                            >
                              Mês
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-init-month"
                              placeholder="Janeiro"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-init-year"
                            >
                              Ano
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-init-year"
                              placeholder="2020"
                              type="number"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <h6 className="heading-small text-muted mb-4">Data de término</h6>
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-end-month"
                            >
                              Mês
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-end-month"
                              placeholder="Janeiro"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-end-year"
                            >
                              Ano
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-end-year"
                              placeholder="2020"
                              type="number"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                      <FormGroup>
                        <label>Descrição do curso</label>
                        <Input
                          className="form-control-alternative"
                          placeholder="Descreva a função do seu antigo cargo aqui..."
                          rows="4"
                          defaultValue=""
                          type="textarea"
                        />
                      </FormGroup>
                    </div>
                    {/* SKILLS */}
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">Skills</h6>
                    <div className="pl-lg-4">
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-formation"
                            >
                              Nome
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-formation"
                              placeholder="Ex: React"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-college"
                            >
                              Porcentagem
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-college"
                              placeholder="Ex: 90%"
                              type="number"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                    </div>
                    {/* IDIOMAS */}
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">Idiomas</h6>
                    <div className="pl-lg-4">
                      <Row>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-formation"
                            >
                              Nome
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-formation"
                              placeholder="Ex: Ingles"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                        <Col lg="6">
                          <FormGroup>
                            <label
                              className="form-control-label"
                              htmlFor="input-college"
                            >
                              Nivel
                            </label>
                            <Input
                              className="form-control-alternative"
                              id="input-college"
                              placeholder="Ex: Intermediario"
                              type="text"
                            />
                          </FormGroup>
                        </Col>
                      </Row>
                    </div>
                    <hr className="my-4" />
                    <h6 className="heading-small text-muted mb-4">
                        Layout
                    </h6>
                    <div className="pl-lg-4">
                      <Row>
                        <Col className="order-lg-2" lg="3">
                            <a href="#pablo" onClick={(e) => e.preventDefault()}>
                              <img
                                alt="..."
                                className="image-layout"
                                src={
                                  require("../../assets/img/logo/layout-image.png")
                                    .default
                                }
                              />
                            </a>
                        </Col>
                      </Row>
                    </div>
                  </Form>
                  <hr className="my-4" />
                  <Row className="align-items-center">
                   <Col className="text-right" xs="12">
                      <Button
                        color="danger"
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                        size="lg"
                      >
                        Limpar
                      </Button>
                      <Button
                        color="success"
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                        size="lg"
                      >
                        preview
                      </Button>
                      <Button
                        color="primary"
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                        size="lg"
                      >
                        Salvar
                      </Button>
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
  
  export default Maker;
  