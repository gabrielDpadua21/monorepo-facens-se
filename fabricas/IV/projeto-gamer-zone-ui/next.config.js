/** @type {import('next').NextConfig} */
module.exports = {
  reactStrictMode: true,
  env: {
    API: process.env.API,
    VERSION: process.env.VERSION
  }
}
