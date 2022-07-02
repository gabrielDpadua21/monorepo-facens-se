import { Button, Container, Row, Col } from "reactstrap";

const UserHeader = () => {
  return (
    <>
      <div
        className="header pb-8 pt-5 pt-lg-8 d-flex align-items-center"
        style={{
          minHeight: "400px",
          backgroundImage:
            "url(" +
            require("../../assets/img/theme/home-profile.jpg").default +
            ")",
          backgroundSize: "cover",
          backgroundPosition: "center top",
        }}
      >
        {/* Mask */}
        <span className="mask bg-gradient-default opacity-8" />
        {/* Header container */}
        <Container className="d-flex align-items-center" fluid>
          <Row>
            <Col lg="10" md="10">
              <h1 className="display-2 text-white">Olá, bem vindo ao MyCV</h1>
              <p className="text-white mt-0 mb-5">
                  O Jeito mais rapido e fácil de rápido de montar curriculos da atualidade,
                  para se diferencias em processo seletivos.
              </p>
            </Col>
          </Row>
        </Container>
      </div>
    </>
  );
};

export default UserHeader;
