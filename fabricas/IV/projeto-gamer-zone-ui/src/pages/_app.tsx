import type { AppProps } from 'next/app'
import { ChakraProvider } from '@chakra-ui/react';
import Meta from '../components/meta/head';

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <ChakraProvider>
      <Meta />
      <Component {...pageProps} />
    </ChakraProvider>
  )
}

export default MyApp
