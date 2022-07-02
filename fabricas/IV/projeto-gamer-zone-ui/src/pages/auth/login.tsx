import {
    Flex,
    Box,
    FormControl,
    FormLabel,
    Input,
    Checkbox,
    Stack,
    Link,
    Button,
    Heading,
    Container,
    Image,
    useColorModeValue,
    ScaleFade,
    useToast,
    InputGroup,
    InputRightElement
} from '@chakra-ui/react';
import { useState } from 'react';
import type { NextPage } from 'next';
import { useRouter } from 'next/router';
import axios from 'axios';

const LoginPage: NextPage = () => {
  const BASE_URL = process.env.API;
  const toast = useToast();
  const router = useRouter();
  const [email, setEmail] = useState<string>('');
  const [password, setPassword] = useState<string>('');
  const [show, setShow] = useState(false)
  const handleClick = () => setShow(!show)

  
  const handleLogin = async () => {
    if(!validate()) return;
    axios.post(`${BASE_URL}/auth/signin`, {email, password})
    .then(async data => {
      const { token } = data.data;
      localStorage.setItem('token', token);
      toast({
        title: 'Login realizado com sucesso',
        status: 'success',
        isClosable: true
      });
      await sleep(1000);
      router.push('/store');
    })
    .catch(error => {
      toast({
        title: 'Usuário ou senha inválidos',
        status: 'error',
        isClosable: true
      });
    })
  }

  const validate = () => {
    if(email && email !== '' && password && password !== '') return true;
    toast({
      title: 'Todos os campos devem ser preenchidos!',
      status: 'error',
      isClosable: true
    })
    return false;
  }

  const sleep = (ms: number) => {
    return new Promise(resolve => setTimeout(resolve, ms));
  }

  return (
      <ScaleFade in={true} initialScale={0.1}>
          <Flex
            minH={'100vh'}
            align={'center'}
            justify={'center'}
            bg={useColorModeValue('gray.50', 'gray.800')}>
            <Stack spacing={8} mx={'auto'} maxW={'lg'} py={12} px={6}>
              <Stack align={'center'}>
                <Heading fontSize={'4xl'}>Faço login na sua conta</Heading>
                <Container
                    as={Stack}
                    maxW={'2xl'}
                    py={4}
                    spacing={4}
                    justify={'center'}
                    align={'center'}>
                    <Link href='/'>
                      <Image src='/images/logo-horizontal.svg' alt='logo'/>
                    </Link>
                </Container>
              </Stack>
              <Box
                rounded={'lg'}
                bg={useColorModeValue('white', 'gray.700')}
                boxShadow={'lg'}
                p={8}>
                <Stack spacing={4}>
                  <FormControl id="email">
                    <FormLabel>E-mail</FormLabel>
                    <Input 
                      type="email"
                      required
                      value={email}
                      onChange={event => setEmail(event.target.value)} 
                    />
                  </FormControl>
                  <FormControl id="password">
                   <FormLabel>Senha</FormLabel>
                    <InputGroup size='md'>
                      <Input
                        pr='4.5rem'
                        type={show ? 'text' : 'password'}
                        placeholder='Senha'
                        value={password}
                        onChange={event => setPassword(event.target.value)} 
                      />
                      <InputRightElement width='4.5rem'>
                        <Button h='1.75rem' size='sm' onClick={handleClick}>
                          {show ? 'Hide' : 'Show'}
                        </Button>
                      </InputRightElement>
                    </InputGroup>
                  </FormControl>
                  <Stack spacing={10}>
                    <Stack
                      direction={{ base: 'column', sm: 'row' }}
                      align={'start'}
                      justify={'space-between'}>
                      <Checkbox>Lembrar de mim</Checkbox>
                      <Link color={'blue.400'}>Esqueci minha senha?</Link>
                    </Stack>
                    <Button
                      bg={'blue.700'}
                      color={'white'}
                      _hover={{
                        bg: 'blue.400',
                      }}
                      onClick={handleLogin}
                      >
                      Entrar
                    </Button>
                  </Stack>
                </Stack>
              </Box>
            </Stack>
          </Flex>
      </ScaleFade>
    );
}

export default LoginPage;