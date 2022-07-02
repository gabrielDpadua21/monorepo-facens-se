import {
    Button,
    Card,
    CardHeader,
    CardBody,
    FormGroup,
    Form,
    Input,
    InputGroupAddon,
    InputGroupText,
    InputGroup,
    Row,
    Col,
} from "reactstrap";

import { useHistory } from "react-router-dom";

import toast, { Toaster } from 'react-hot-toast';
import { useState } from 'react';

const NewLogin = () => {
    const history = useHistory();
    const [email, setEmail] = useState();
    const [password, setPassword] = useState();

    const validateLogin = () => {
      if(!email || !password || email !== 'gabriel.eng16@gmail.com' || password !== '123456') {
        toast.error('Login ou senha inválidos');
        return;
      }
      toast.success('Login realizado com sucesso!');
      localStorage.setItem('name', 'Gabriel');
      setTimeout(() => {
        history.push('/admin/home');
      }, 1000);
    }

    const goToRegister = () => {
      history.push('/auth/register');
    }

    return (
      <>
        <Col lg="5" md="7">
          <Card className="bg-secondary shadow border-0">
            <CardHeader className="bg-transparent pb-5">
              <div className="text-muted text-center mt-2 mb-2">
                <small>Faça Login</small>
              </div>
            </CardHeader>
            <CardBody className="px-lg-5 py-lg-5">
              <Form role="form">
                <FormGroup className="mb-3">
                  <InputGroup className="input-group-alternative">
                    <InputGroupAddon addonType="prepend">
                      <InputGroupText>
                        <i className="ni ni-email-83" />
                      </InputGroupText>
                    </InputGroupAddon>
                    <Input
                      placeholder="Email"
                      type="email"
                      autoComplete="new-email"
                      value={email}
                      onChange={e => setEmail(e.target.value)}
                    />
                  </InputGroup>
                </FormGroup>
                <FormGroup>
                  <InputGroup className="input-group-alternative">
                    <InputGroupAddon addonType="prepend">
                      <InputGroupText>
                        <i className="ni ni-lock-circle-open" />
                      </InputGroupText>
                    </InputGroupAddon>
                    <Input
                      placeholder="Password"
                      type="password"
                      autoComplete="new-password"
                      value={password}
                      onChange={e => setPassword(e.target.value)}
                    />
                  </InputGroup>
                </FormGroup>
                <div className="custom-control custom-control-alternative custom-checkbox">
                  <input
                    className="custom-control-input"
                    id=" customCheckLogin"
                    type="checkbox"
                  />
                  <label
                    className="custom-control-label"
                    htmlFor=" customCheckLogin"
                  >
                    <span className="text-muted">Remember me</span>
                  </label>
                </div>
                <div className="text-center">
                  <Button onClick={validateLogin} className="my-4" color="primary" type="button">
                    Entrar
                  </Button>
                </div>
              </Form>
            </CardBody>
          </Card>
          <Row className="mt-3">
            <Col xs="6">
              <a
                className="text-light"
                href="#pablo"
                onClick={(e) => e.preventDefault()}
              >
                <small>Esqueceu a senha?</small>
              </a>
            </Col>
            <Col className="text-right" xs="6">
              <a
                className="text-light"
                href="#pablo"
                onClick={goToRegister}
              >
                <small>Não tem conta? criar agora!!!</small>
              </a>
            </Col>
          </Row>
        </Col>
        <Toaster />
      </>
    );
  };
  
  export default NewLogin;
  