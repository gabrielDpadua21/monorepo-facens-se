import { Button, Container, Row, Col } from "reactstrap";

const UserHeader = (props) => {
  return (
    <>
      <div
        className="header pb-8 pt-5 pt-lg-8 d-flex align-items-center"
        style={{
          minHeight: "200px",
          backgroundImage:
            "url(" +
            require("../../assets/img/theme/home-profile.jpg").default +
            ")",
          backgroundSize: "cover",
          backgroundPosition: "center top",
        }}
      >
        <span className="mask bg-gradient-default opacity-8" />
        <Container className="d-flex align-items-center" fluid>
          <Row>
            <Col lg="12" md="12">
              <h1 className="display-3 text-white">
                {props.title}
              </h1>
            </Col>
          </Row>
        </Container>
      </div>
    </>
  );
};

export default UserHeader;
