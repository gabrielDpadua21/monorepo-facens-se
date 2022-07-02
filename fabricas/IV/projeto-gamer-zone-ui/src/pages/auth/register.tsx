import {
    Flex,
    Box,
    FormControl,
    FormLabel,
    Input,
    Container,
    Image,
    Stack,
    Link,
    Button,
    Heading,
    Text,
    Checkbox,
    useColorModeValue,
    ScaleFade,
    useToast
} from '@chakra-ui/react';
import { useState } from 'react';
import type { NextPage } from 'next';
import { useRouter } from 'next/router';
import axios from 'axios';

const RegisterPage: NextPage = () => {
    const BASE_URL = process.env.API;
    const toast = useToast()
    const router = useRouter();
    const [name, setName] = useState<string>('');
    const [email, setEmail] = useState<string>('');
    const [password, setPassword] = useState<string>('');
    const [passwordConfirm, setPasswordConfirm] = useState<string>('');

    const handleSignup = async () => {
      if(!validate()) return;
      if(!validatePasswords()) return;
      axios.post(`${BASE_URL}/auth/signup`, {name, email, password, passwordConfirm})
      .then(async data => {
        console.log(data);
        const { token } = data.data.data;
        localStorage.setItem('token', token);
         toast({
           title: 'Usuário criado com sucesso!',
           status: 'success',
           isClosable: true
         })

         await sleep(1000);
         router.push('/store');
      })
      .catch(err => {
        toast({
          title: 'Usuário existente ou inválido',
          status: 'error',
          isClosable: true
        })
      })
    }

    const validate = () => {
      if(name && name !== '' && email && email !== '' && password && password !== '') return true;
      toast({
        title: 'Todos os campos devem ser preenchidos!',
        status: 'error',
        isClosable: true
      })
      return false;
    }

    const validatePasswords = (): boolean => {
      if(password !== passwordConfirm) {
          toast({
            title: 'Senhas não coincidem!',
            status: 'error',
            isClosable: true
          })
        return false;
      }
      return true;
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
                <Heading fontSize={'4xl'}>Crie sua conta</Heading>
                <Container
                    as={Stack}
                    maxW={'2xl'}
                    py={4}
                    spacing={4}
                    justify={'center'}
                    align={'center'}>
                    <Link href='/'>
                      <Image src='/images/logo-vertical.svg' alt='logo'/>
                    </Link>
                </Container>
                <Text fontSize={'lg'} color={'gray.600'}>
                  Para desfrutar dos melhores <Link color={'blue.400'}>jogos da atualidade</Link> ✌️
                </Text>
              </Stack>
              <Box
                rounded={'lg'}
                bg={useColorModeValue('white', 'gray.700')}
                boxShadow={'lg'}
                p={8}>
                <Stack spacing={4}>
                  <FormControl id="nome">
                    <FormLabel>Nome</FormLabel>
                    <Input 
                      type="text" 
                      required 
                      value={name} 
                      onChange={event => setName(event.target.value)}
                    />
                  </FormControl>
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
                    <Input 
                      type="password" 
                      required
                      value={password} 
                      onChange={event => setPassword(event.target.value)}
                    />
                  </FormControl>
                  <FormControl id="password2">
                    <FormLabel>Confirmar senha</FormLabel>
                    <Input 
                      type="password" 
                      required
                      value={passwordConfirm} 
                      onChange={event => setPasswordConfirm(event.target.value)}
                    />
                  </FormControl>
                  <Stack spacing={10}>
                    <Stack
                      direction={{ base: 'column', sm: 'row' }}
                      align={'start'}
                      justify={'space-between'}>
                      <Checkbox>Eu aceito os temos de Politica de Privacidade</Checkbox>
                    </Stack>
                    <Button
                      bg={'blue.700'}
                      color={'white'}
                      _hover={{
                        bg: 'blue.400',
                      }}
                      onClick={handleSignup}
                      >
                      Cadastrar
                    </Button>
                  </Stack>
                </Stack>
              </Box>
            </Stack>
          </Flex>
      </ScaleFade>
      
    );
}

export default RegisterPage;