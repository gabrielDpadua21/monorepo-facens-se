import { useState } from "react";

import {
    Badge,
    Card,
    CardHeader,
    CardFooter,
    DropdownMenu,
    DropdownItem,
    UncontrolledDropdown,
    DropdownToggle,
    Media,
    Pagination,
    PaginationItem,
    PaginationLink,
    Table,
    Container,
    Row,
  } from "reactstrap";

import NewHeader from "components/Headers/NewHeader";
import { useHistory } from 'react-router-dom';
import toast, { Toaster } from 'react-hot-toast';

const mockCv = [
    {
        name: "curriculum 1",
        date: "01/06/2022",
        status: "PENDENTE"
    },
    {
        name: "curriculum 2",
        date: "01/06/2022",
        status: "EXPORTADO"
    },
    {
        name: "curriculum 3",
        date: "01/06/2022",
        status: "FINALIZADO"
    },
    {
        name: "curriculum 4",
        date: "01/06/2022",
        status: "PENDENTE"
    }
]

const Home = (props) => {
  const history = useHistory();
  
  const goToPreview = () => {
    history.push('/admin/preview')
  }

  const exportPdf = () => {
    toast.promise(
      exportTo(),
       {
         loading: 'Gerando PDF...',
         success: <b>PDF gerado com sucesso! verifique seu e-mail</b>,
         error: <b>Falha ao gerar PDF.</b>,
       }
     );
  }

  const exportTo = () => {
    return new Promise(function(resolve) {
      setTimeout(resolve, 3000);
  });
  }

  return (
    <>
      <NewHeader />
      <Container className="mt--7" fluid>
        <Row>
          <div className="col">
            <Card className="shadow">
              <CardHeader className="border-0">
                <h3 className="mb-0">Lista de Curriculos criados</h3>
              </CardHeader>
              <Table className="align-items-center table-flush" responsive>
                <thead className="thead-light">
                  <tr>
                    <th scope="col">Nome do Projeto</th>
                    <th scope="col">Data de Criação</th>
                    <th scope="col">Status</th>
                    <th scope="col" />
                  </tr>
                </thead>
                <tbody>
                    { mockCv.map(cv => {
                        return (
                          <tr>
                            <th scope="row">
                              <Media className="align-items-center">
                                <Media>
                                  <span className="mb-0 text-sm">
                                    {cv.name}
                                  </span>
                                </Media>
                              </Media>
                            </th>
                            <td>{cv.date}</td>
                            <td>
                              <Badge color="" className="badge-dot mr-4">
                                <i className="bg-warning" />
                                 {cv.status}
                              </Badge>
                            </td>
                            <td className="text-right">
                              <UncontrolledDropdown>
                                <DropdownToggle
                                  className="btn-icon-only text-light"
                                  href="#pablo"
                                  role="button"
                                  size="sm"
                                  color=""
                                  onClick={(e) => e.preventDefault()}
                                >
                                  <i className="fas fa-ellipsis-v" />
                                </DropdownToggle>
                                <DropdownMenu className="dropdown-menu-arrow" right>
                                <DropdownItem
                                    href="#pablo"
                                    onClick={goToPreview}
                                  >
                                    Preview
                                  </DropdownItem>
                                  <DropdownItem
                                    href="#pablo"
                                    onClick={exportPdf}
                                  >
                                    Exportar
                                  </DropdownItem>
                                  <DropdownItem
                                    href="#pablo"
                                    onClick={(e) => e.preventDefault()}
                                  >
                                    Editar
                                  </DropdownItem>
                                  <DropdownItem
                                    href="#pablo"
                                    onClick={(e) => e.preventDefault()}
                                  >
                                    Excluir
                                  </DropdownItem>
                                </DropdownMenu>
                              </UncontrolledDropdown>
                            </td>
                          </tr> 
                        )
                    }) }
                </tbody>
              </Table>
              <CardFooter className="py-4">
                <nav aria-label="...">
                  <Pagination
                    className="pagination justify-content-end mb-0"
                    listClassName="justify-content-end mb-0"
                  >
                    <PaginationItem className="disabled">
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                        tabIndex="-1"
                      >
                        <i className="fas fa-angle-left" />
                        <span className="sr-only">Previous</span>
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem className="active">
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        1
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem>
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        2 <span className="sr-only">(current)</span>
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem>
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        3
                      </PaginationLink>
                    </PaginationItem>
                    <PaginationItem>
                      <PaginationLink
                        href="#pablo"
                        onClick={(e) => e.preventDefault()}
                      >
                        <i className="fas fa-angle-right" />
                        <span className="sr-only">Next</span>
                      </PaginationLink>
                    </PaginationItem>
                  </Pagination>
                </nav>
              </CardFooter>
            </Card>
          </div>
        </Row>
      </Container>
      <Toaster />
    </>
  );
};

export default Home;
